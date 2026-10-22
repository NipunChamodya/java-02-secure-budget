# ☕ Java Day 2: Secure Budget Analyzer

A command-line Java application that acts as a secure personal finance tool. It requires users to pass an authentication check before calculating their monthly savings and providing customized financial feedback.

## ✨ Features
* **Authentication System:** Validates a specific username and password before granting access to the calculator.
* **Expense Tracking:** Takes user input for monthly income, food, and bill expenses.
* **Financial Evaluation:** Calculates the remaining balance and gives real-time feedback on spending habits (e.g., "You saved money" vs "You broke in this month").

## 🧠 Concepts Applied
* **Control Flow:** `if`, `else if`, and `else` statements to guide the program's decisions.
* **Logical Operators:** Used `&&` (AND) to ensure *both* the username and password match before granting access.
* **String Comparison:** Used `.equals()` for secure, case-sensitive password checking instead of `==`.
* **Nested Logic:** Placed the budget calculation logic *inside* the successful login condition.

## 🚀 How to Run
1. Clone the repository and open it in your Java IDE (e.g., IntelliJ IDEA).
2. Run the `Main.java` file.
3. Enter the default credentials when prompted:
    * **Username:** `Nipun`
    * **Password:** `Nipun@123`
4. Enter your income and expenses to see your savings status!