package com.adi;

import com.adi.abstract_factory.AbstractFactory;
import org.dom4j.*;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.Iterator;
import java.util.function.Consumer;

public class XMLUtils {



    public static String getConfig(String path) throws DocumentException {
        SAXReader reader = new SAXReader();
        Document document = reader.read(new File(path));
        Element rootElement = document.getRootElement();
        return rootElement.elementTextTrim("class-name");
    }

}
