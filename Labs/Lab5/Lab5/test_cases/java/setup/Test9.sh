#!/bin/bash
# All variables that are exported/imported are in upper case convention. They are:
#   TESTDIR : name of the test directory
#   LANGUAGE : language in which the student has submitted an evaluation request
#copy all the files under test from "student_solution/" and support files from "author_solution/"
#copy all source files first

# DO NOT MODIFY
cp -rf author_solution/java/lib working_dir/

# ADD THE STUDENT SOLUTION FILES HERE
cp -f student_solution/java/SchoolMember.java working_dir/
cp -f student_solution/java/Student.java working_dir/
cp -f student_solution/java/Teacher.java working_dir/
cp -f student_solution/java/PartTimeStudent.java working_dir/
cp -f student_solution/java/FullTimeStudent.java working_dir/

# STUDENT SOLUTION FILES END HERE

# DO NOT MODIFY
cp -f "$TESTDIR"/"$LANGUAGE"/tests/AbstractTest.java working_dir/

# COPY THE TEST FILES HERE 
cp -f "$TESTDIR"/"$LANGUAGE"/tests/Test9.java working_dir/Test.java
cp -f "$TESTDIR"/"$LANGUAGE"/tests/SchoolMemberTest.java working_dir/
cp -f "$TESTDIR"/"$LANGUAGE"/tests/StudentTest.java working_dir/
cp -f "$TESTDIR"/"$LANGUAGE"/tests/TeacherTest.java working_dir/
cp -f "$TESTDIR"/"$LANGUAGE"/tests/PartTimeStudentTest.java working_dir/
cp -f "$TESTDIR"/"$LANGUAGE"/tests/FullTimeStudentTest.java working_dir/

# TEST FILES END HERE