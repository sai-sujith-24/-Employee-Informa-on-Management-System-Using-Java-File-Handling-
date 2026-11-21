# Employee Information Management System

Java file-handling lab demonstrating writing, reading and appending employee records using `FileInputStream` / `FileOutputStream`.

## Run
```bash
javac EmployeeManagement.java
java EmployeeManagement
```

## File format
`Employee.txt` stores `ID,Name,Designation,Salary` rows. Sample records are retained.

## Important
Menu option **1 (Write)** replaces the file; option **3 (Append)** adds to it. Back up `Employee.txt` before using Write. Input is validated for positive ID, finite nonnegative salary and comma-free nonempty text. Future improvements: enforce unique IDs, handle malformed rows, prevent accidental overwrites, and use a proper CSV parser.
