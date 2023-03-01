package co.com.certificacion.RetoFortesza.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.certificacion.RetoFortesza.userinterface.CrearUsuarioUI.VERIRYMESSAGE;

public class UserCreatedQuestion implements Question<Boolean>
{
    String word;

    public UserCreatedQuestion(String word)
    {
        this.word = word;
    }


    public static UserCreatedQuestion wasCreate(String questionv)
    {
        return new UserCreatedQuestion(questionv);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String text = Text.of(VERIRYMESSAGE).viewedBy(actor).asString();
        return word.equals(text);
    }
}
