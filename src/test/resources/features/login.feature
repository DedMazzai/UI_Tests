# language:ru
Функционал: Проверка Логина
  Сценарий: Проверка регистрации с некорректным паролем
    * Заполняется поле "Email" значением "mazzai.test@gmail.com"
    * Заполняется поле "Password" значением "111111"
    * Нажимается кнопка "Login"
    * Появляется подсказка об ошибке These credentials do not match our records.