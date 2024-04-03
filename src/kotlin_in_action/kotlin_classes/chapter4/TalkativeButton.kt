package kotlin_in_action.kotlin_classes.chapter4
//Kotlin запрещает ссылаться из публичной функции giveSpeech на тип
//TalkativeButton с более узкой областью видимости (в данном случае
//internal).

/*internal open*/  class TalkativeButton {
   /* private*/ fun yell() = println("Hey !")  //примеры с ошибкой
   /* protected */fun whisper() = println("lets talk")

}

fun TalkativeButton.giveSpeech() {//Ошибка: «публичный член классса раскрывает
                                // внутренний> тип-приемник << TalkativeButton»
   yell()//недоступна так как  модификтар доступа private
   whisper() //недоступна так как protected
}