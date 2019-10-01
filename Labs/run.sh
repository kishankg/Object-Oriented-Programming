#!/bin/bash

cp ~/"eclipse-workspace/Lab5/src/FullTimeStudent.java" ~/"Documents/Lab5/student_solution/java/"
cp ~/"eclipse-workspace/Lab5/src/PartTimeStudent.java" ~/"Documents/Lab5/student_solution/java/"
cp ~/"eclipse-workspace/Lab5/src/SchoolMember.java" ~/"Documents/Lab5/student_solution/java/"
cp ~/"eclipse-workspace/Lab5/src/Student.java" ~/"Documents/Lab5/student_solution/java/"
cp ~/"eclipse-workspace/Lab5/src/Teacher.java" ~/"Documents/Lab5/student_solution/java/"

echo ""
echo "Executing..."

bash execute.sh java 

echo "Following are your results:"
cat results/scores.txt
echo ""
