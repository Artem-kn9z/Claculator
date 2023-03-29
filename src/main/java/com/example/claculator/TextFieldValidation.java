package com.example.claculator;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.scene.control.TextField;
import java.util.function.*;

public class TextFieldValidation extends TextField {
    private final ObjectProperty<ValidationChecker> onValidate =
            new SimpleObjectProperty<>(this, "onValidate", null);
    private final ObjectProperty<Predicate<String>> symbolsChecker =
            new SimpleObjectProperty<>(this, "symbolsChecker", null);
    private final ObjectProperty<Predicate<String>> textChecker =
            new SimpleObjectProperty<>(this, "textChecker", null);

    @Override
    public void replaceText(int start, int end, String text){
        if(this.getText() == null || this.getText() == null){
            //Если не определеные функции проверки символов или текста
            //вести себя как обычное текстовое поле
            super.replaceText(start, end, text);
            return;
        }
//        if(this.getText().test(text)) {
//            //Если введённый текст/символы проходят проверку
//            //Добавляем его к уже имеющемуся тексту
//            //symbolstChecker ограничивает вводимые символы
//            super.replaceText(start, end, text);
//        }
//        if(this.getTextChecker().test(this.getText())) {
//            //Если полный текст поля проходит проверку
//            //Уведомляем валидатор, что всё хорошо
//            Platform.runLater(() -> this.getOnValidate().handle(new
//                    ValidationUpdateEvent(this.getId(), true)));
//        }
//        else {
//            //Иначе, уведомляем о том, что всё плохо и
//            //какой-то контрол стоит заблокировать
//            Platform.runLater(() -> this.getOnValidate().handle(new
//                    ValidationUpdateEvent(this.getId(), false)));
//        }
    }

    private class ValidationChecker {
    }
}
