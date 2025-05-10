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
        code = "MAD202",
        credit = 4,
        description = "Covers Android development using Jetpack Compose.",
        prerequisites = "Programming Fundamentals"
    ),
    Course(
        title = "Data Structures",
        code = "DS204",
        credit = 3,
        description = "In-depth study of data structures.",
        prerequisites = "Programming Fundamentals"
    )
)
