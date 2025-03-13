import 'package:flutter/material.dart';

class ThemeProvider with ChangeNotifier {
  ThemeData _currentTheme = ThemeData.light();

  ThemeData get currentTheme => _currentTheme;

  void switchTheme() {
    _currentTheme = _currentTheme == ThemeData.light()
        ? ThemeData.dark()
        : ThemeData.light();
    notifyListeners();
  }
}
