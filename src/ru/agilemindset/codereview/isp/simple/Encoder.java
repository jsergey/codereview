package ru.agilemindset.codereview.isp.simple.answer;

import java.io.Writer;

/**
 * Created by sergeybaranov on 24/1/18.
 */
public interface Encoder {

    void encode(String value, Writer writer);

}
