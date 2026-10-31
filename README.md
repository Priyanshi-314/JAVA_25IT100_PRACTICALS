# OOP Part A – Practicals 1 to 14

This ZIP contains Java source code for **every Part A question** in the supplied OOP practical list, including every item labelled **For Advanced Learners – home**. Practical 14 has two Part A questions in the PDF, so both are included.

## Folder layout
Each practical has its own folder, and each question has its own folder. Compile/run a normal question from its question folder using `javac *.java` followed by `java MainClassName`. Where multiple Java files share a question, compile them together.

## Question checklist

- Practical 1: Q1, Q2, Q3 (Advanced Learners)
- Practical 2: Q1, Q2, Q3 (Advanced Learners)
- Practical 3: Q1, Q2, Q3 (Advanced Learners)
- Practical 4: Q1, Q2, Q3 (Advanced Learners)
- Practical 5: Q1, Q2, Q3 (Advanced Learners)
- Practical 6: Q1, Q2, Q3 (Advanced Learners)
- Practical 7: Q1, Q2, Q3 (Advanced Learners)
- Practical 8: Q1, Q2, Q3 (Advanced Learners)
- Practical 9: Q1, Q2, Q3 (Advanced Learners)
- Practical 10: Q1, Q2, Q3 (Advanced Learners)
- Practical 11: Q1, Q2, Q3 (Advanced Learners)
- Practical 12: Q1, Q2, Q3 (Advanced Learners)
- Practical 13: Q1, Q2, Q3 (Advanced Learners)
- Practical 14: Q1, Q2 (Q2 is Advanced Learners)

## Special run instructions
- Practical 6 Q3 is packaged as `discount.Main`. From its question folder: `javac -d out Main.java`, then `java -cp out discount.Main`. To create a runnable JAR: `jar --create --file discount.jar --main-class discount.Main -C out .`, then `java -jar discount.jar`.
- Practical 14 Q2 is packaged under `packagedapp`. From that question folder: `javac -d out model/Task.java service/TaskService.java Main.java`, then `java -cp out packagedapp.Main`. To create a runnable JAR: `jar --create --file tasks.jar --main-class packagedapp.Main -C out .`, then `java -jar tasks.jar`. This question also saves and reloads `tasks.txt`.
- Practical 14 Q1 includes three simple test methods run from `main` (no external JUnit dependency), plus a small menu.
- Practical 11 Q1/Q2 create their sample data files when run. Do not commit generated `.class`, `.dat`, `.txt`, or `.jar` files if your repository should contain only `.java` files.

## Note
The solutions follow the tasks in the provided practical PDF. Sample values and test data are included where the PDF leaves design choices open.
