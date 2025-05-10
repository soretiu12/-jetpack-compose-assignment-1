package com.example.courseapp

data class Course(
    val title: String,
    val code: String,
    val credit: Int,
    val description: String,
    val prerequisites: String
)

val sampleCourses = listOf(
    Course(
        title = "Mobile App Development",
        code = "MAD401",
        credit = 4,
        description = "Learn to build native Android apps using Jetpack Compose and Kotlin.",
        prerequisites = "Basic knowledge of Kotlin and UI design"
    ),
    Course(
        title = "Database Systems",
        code = "DBS301",
        credit = 3,
        description = "Covers relational databases, SQL, and database design.",
        prerequisites = "Introduction to Programming"
    ),
    Course(
        title = "Operating Systems",
        code = "OPS302",
        credit = 3,
        description = "Learn about memory management, process scheduling, and system calls.",
        prerequisites = "Computer Architecture"
    ),
    Course(
        title = "Web Development",
        code = "WEB201",
        credit = 3,
        description = "Covers HTML, CSS, JavaScript, and modern web frameworks.",
        prerequisites = "Introduction to Programming"
    ),
    Course(
        title = "Software Engineering",
        code = "SWE305",
        credit = 3,
        description = "Introduces software development methodologies and project management.",
        prerequisites = "Object-Oriented Programming"
    ),
    Course(
        title = "Data Structures",
        code = "DS202",
        credit = 3,
        description = "Study of arrays, linked lists, stacks, queues, and trees.",
        prerequisites = "Introduction to Programming"
    )
)
