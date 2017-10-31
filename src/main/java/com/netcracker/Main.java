package com.netcracker;

import com.netcracker.beans.Translator;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Этот класс не содержит никакого полезного кода. Он только "вытаскивает" нужный бин и запускает его.
 */
public class Main {

    public static void main(String[] args) {

        /**
         * Здесь мы создаем объект для обращения к контексту.
         * Контекст - это то место, где Spring создал объекты,
         * которые мы ему сказали создать в файле "spring-config.xml".
         */
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        /**
         * Теперь мы "достаем" из контекста ссылку на бин с именем "netcrackerDictionary".
         */
        Translator translator = (Translator) context.getBean("netcrackerTranslator");

        /**
         * Теперь мы можем обращаться с ним как с обычным объектом.
         * Spring сам внедрил в этот переводчик указанный нами словарь.
         */
        System.out.println(translator.getTranslation());
    }
}
