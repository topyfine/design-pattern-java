package com.younger.pattern.behavior.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Younger
 */
public class ObjectStructure {
    private List<Element> elementList = new ArrayList<>();

    void add(Element element) {
        elementList.add(element);
    }

    void trace(Visitor visitor) {
        elementList.forEach(element -> element.acceptVisitor(visitor));
    }
}
