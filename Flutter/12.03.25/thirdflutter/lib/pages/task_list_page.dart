import 'package:flutter/material.dart';
import 'database_helper.dart';
import 'add_task_page.dart';

class TaskListPage extends StatefulWidget {
  const TaskListPage({super.key});

  @override
  _TaskListPageState createState() => _TaskListPageState();
}

class _TaskListPageState extends State<TaskListPage> {
  List<Map<String, dynamic>> _tasks = [];

  @override
  void initState() {
    super.initState();
    _loadTasks();
  }

  Future<void> _loadTasks() async {
    final tasks = await DatabaseHelper().getTasks();
    setState(() {
      _tasks = tasks;
    });
  }

  Future<void> _deleteTask(int id) async {
    final db = await DatabaseHelper().database;
    await db.delete("tasks", where: "id = ?", whereArgs: [id]);
    _loadTasks();
  }

  void _navigateToAddTaskPage() async {
    final result = await Navigator.push(
      context,
      MaterialPageRoute(builder: (_) => AddTaskPage()),
    );

    if (result != null) {
      await DatabaseHelper().insertTask(result);
      _loadTasks();
    }
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: Text("Task List")),
      body: _tasks.isEmpty
          ? Center(child: Text("No tasks available"))
          : ListView.builder(
              itemCount: _tasks.length,
              itemBuilder: (context, index) {
                final task = _tasks[index];
                return Card( 
                  elevation: 3,
                  margin: EdgeInsets.symmetric(vertical: 5, horizontal: 10),
                  child: ListTile(
                    title: Text(task['title'], style: TextStyle(fontWeight: FontWeight.bold)),
                    subtitle: Text("${task['description']} - ${task['category']}"),
                    trailing: IconButton(
                      icon: Icon(Icons.delete, color: Colors.red, size: 28), 
                      onPressed: () {
                        _deleteTask(task['id']);
                      },
                    ),
                  ),
                );
              },
            ),
      floatingActionButton: FloatingActionButton(
        onPressed: _navigateToAddTaskPage,
        child: Icon(Icons.add),
      ),
    );
  }
}
