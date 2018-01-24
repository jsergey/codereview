package ru.agilemindset.codereview.isp.simple.answer;

import java.io.Reader;

/**
 * Created by sergeybaranov on 24/1/18.
 */
public interface Decoder {

    String decode(Reader reader);

}
