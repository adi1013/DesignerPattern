package com.adi.abstract_factory;

import com.adi.XMLUtils;
import org.dom4j.DocumentException;

public class Test {
    public static void main(String[] args) {
        try {
            String config = XMLUtils.getConfig("resource/abstract_factory_config.xml");
            AbstractFactory instance = (AbstractFactory)Class.forName(config).newInstance();
            instance.createAirConditioner().refrigeration();
            instance.createFreezer().keepFresh();
            instance.createWasher().wash();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
