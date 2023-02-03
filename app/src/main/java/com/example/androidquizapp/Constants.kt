package com.example.androidquizapp

object Constants {
    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Question> {
        val questions = ArrayList<Question>()

        val qOne = Question(
            1,
            "What question does this flag belong to?",
             R.drawable.ic_flag_of_brazil,
            "Argentina",
            "Australia",
            "Afghanistan",
            "Brazil",
            4)
        val qTwo = Question(
            2,
            "What question does this flag belong to?",
            R.drawable.ic_flag_of_argentina,
            "America",
            "China",
            "Argentina",
            "Kazakhstan",
            3)
        val qThree = Question(
            3,
            "What question does this flag belong to?",
            R.drawable.ic_flag_of_belgium,
            "Belgium",
            "America",
            "Turkey",
            "Canada",
            1)
        val qFour = Question(
            4,
            "What question does this flag belong to?",
            R.drawable.ic_flag_of_australia,
            "India",
            "New Zealand",
            "Germany",
            "Australia",
            4)
        val qFive = Question(
            5,
            "What question does this flag belong to?",
            R.drawable.ic_flag_of_fiji,
            "Fiji",
            "Italy",
            "Albania",
            "Austria",
            1)
        val qSix = Question(
            6,
            "What question does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "Belgium",
            "Finland",
            "Czechia",
            "Kuwait",
            4)
        val qSeven = Question(
            7,
            "What question does this flag belong to?",
            R.drawable.ic_flag_of_new_zealand,
            "New Zealand",
            "Ireland",
            "Zimbabwe",
            "Singapore",
            1)
        val qEight = Question(
            8,
            "What question does this flag belong to?",
            R.drawable.ic_flag_of_denmark,
            "New Zealand",
            "Estonia",
            "Denmark",
            "Turkmenistan",
            3)
        val qNine = Question(
            9,
            "What question does this flag belong to?",
            R.drawable.ic_flag_of_germany,
            "Afghanistan",
            "Germany",
            "Azerbaijan",
            "Qatar",
            2)

        questions.add(qOne)
        questions.add(qTwo)
        questions.add(qThree)
        questions.add(qFour)
        questions.add(qFive)
        questions.add(qSix)
        questions.add(qSeven)
        questions.add(qEight)
        questions.add(qNine)

        return questions
    }
}