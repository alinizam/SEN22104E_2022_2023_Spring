/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Theory4;

/**
 *
 * @author ali.nizam
 */
public class StockException extends RuntimeException{
    int remainingITem;
    public StockException() {
    }

    public StockException(int remainingITem) {
        this.remainingITem = remainingITem;
    }
    
}
