package ru.agilemindset.codereview.isp.simple;

import java.io.Reader;
import java.io.Writer;

/**
 * Created by sergeybaranov on 24/1/18.
 */
public interface StringCodec {

    String decode(Reader reader);

    void encode(String value, Writer writer);

}
