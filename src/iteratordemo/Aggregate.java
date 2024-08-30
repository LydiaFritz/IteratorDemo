/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package iteratordemo;

import java.util.Iterator;

/**
 *
 * @author lkfritz
 */
public interface Aggregate<T> {
    Iterator<T> createIterator();
}
