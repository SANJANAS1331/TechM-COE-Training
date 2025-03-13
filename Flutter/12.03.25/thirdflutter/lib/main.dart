import 'package:flutter/material.dart';
import 'package:provider/provider.dart';
import 'pages/home_page.dart'; 
import 'pages/theme_provider.dart'; 
import 'pages/database_helper.dart'; 

void main() async {
  WidgetsFlutterBinding.ensureInitialized();
  
  await DatabaseHelper().deleteDatabaseFile();

  runApp(
    MultiProvider(
      providers: [
        ChangeNotifierProvider(create: (context) => ThemeProvider()),
      ],
      child: TaskManagerApp(),
    ),
  );
}

class TaskManagerApp extends StatelessWidget {
  const TaskManagerApp({super.key});

  @override
  Widget build(BuildContext context) {
    return Consumer<ThemeProvider>(
      builder: (context, themeProvider, child) {
        return MaterialApp(
          debugShowCheckedModeBanner: false,
          title: 'Task Manager',
          theme: themeProvider.currentTheme,
          home: HomePage(),
        );
      },
    );
  }
}
