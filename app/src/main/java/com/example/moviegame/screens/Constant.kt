package com.example.MovieApp

object Constants {

    fun getQuestion(): ArrayList<Question> {

        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1,
            "How is the first Kazakh film nominated for the Golden Palm wind Cannes Film Festival?",
            R.drawable.kelin,
            "Kelin",
            "Menin atym Kozha",
            "Kosh bol Gulsary",
            "Kyz Zhibek",
            1
        )


        val que2 = Question(
            2,
            "Who played the role of Harley Quinn in the movie(2016)?",
            R.drawable.margot,
            "Scarlett Johansson",
            "Gal Gadot",
            "Margot Robbie",
            "Emma Stone",
            3
        )


        val que3 = Question(
            3,
            "Which movie didn't have Winona Ryder in it?", R.drawable.grape,
            "Lucas",
            "What's eating Gilbert Grape?",
            "Dracula",
            "Interrupted life",
            2
        )


        val que4 = Question(
            4,
            "Which actress has won the most Oscars?", R.drawable.katharine,
            "Meryl Streep",
            "Ingrid Bergman",
            "Katharine Hepburn",
            "Jimmy Fallon",
            3
        )


        val que5 = Question(
            5,
            "On the set of which movie did Miley Cyrus and Liam Hemsworth first meet?",
            R.drawable.song,
            "The last song",
            "The Hunger Games",
            "Quiet Harbor",
            "The Bourne Supremacy",
            1
        )


        val que6 = Question(
            6,
            "Which child was not on a trip to the Wonka Factory in the movie Willy Wonka and the Chocolate Factory?",
            R.drawable.billy,
            "Mike Teavee",
            "Veruki Salt",
            "Billy the Warp",
            "Charlie Bucket",
            3
        )


        val que7 = Question(
            7,
            "How many Oscars has Halle Berry won?", R.drawable.one,
            "2",
            "1",
            "4",
            "3",
            2
        )


        val que8 = Question(
            8,
            "Who actually painted the Rose in Titanic?", R.drawable.james,
            "Leonardo DiCaprio",
            "Billy Zane",
            "Angelina Jolie",
            " James Cameron",
            4
        )


        val que9 = Question(
            9,
            "What country flag is this", R.drawable.canada,
            "Denmark",
            "Argentina",
            "Canada",
            "USA",
            3
        )


        val que10 = Question(
            10,
            "What country flag is this", R.drawable.india,
            "India",
            "Iran",
            "Ireland",
            "USA",
            1
        )


        questionsList.add(que1)
        questionsList.add(que2)
        questionsList.add(que3)
        questionsList.add(que4)
        questionsList.add(que5)
        questionsList.add(que6)
        questionsList.add(que7)
        questionsList.add(que8)
        questionsList.add(que9)
        questionsList.add(que10)




        return questionsList
    }
}