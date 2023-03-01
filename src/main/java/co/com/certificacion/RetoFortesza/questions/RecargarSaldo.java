package co.com.certificacion.RetoFortesza.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.certificacion.RetoFortesza.userinterface.LoginUI.VERIFICARRECARGARSALDO;

public class RecargarSaldo implements Question<Boolean>
{
        String word;

public RecargarSaldo(String word)
        {
        this.word = word;
        }


public static RecargarSaldo fortesza(String questionv)
        {
        return new RecargarSaldo(questionv);
        }

@Override
public Boolean answeredBy(Actor actor) {
        String text = Text.of(VERIFICARRECARGARSALDO).viewedBy(actor).asString();
        return word.equals(text);
        }
        }