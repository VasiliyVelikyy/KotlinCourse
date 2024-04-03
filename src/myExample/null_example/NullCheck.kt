package myExample.null_example

class NullCheck {
    fun test() {
        val response1 = "test"
        val response2 = ""
        var response3: String? = null;
        var context1 = Context()


        // response1.isNotEmpty().also { println("response1 notEmpty") }
        //  response2.isNotEmpty().also { println("response2 notEmpty") }
        response3?.let { println("response3 not empty") } //не выведет
        response3.let { println("response3 not empty") } //выведет response3 not empty
        response3.let { println("$response3 not empty") } //выведет null not empty

        context1.content?.let { println("content not empty") } //не выведе
        if (response1.isNotBlank()) println("response1 notEmpty") //выведет
        if (response2.isNotBlank()) println("response2 notEmpty") //невыведет

    }

}

