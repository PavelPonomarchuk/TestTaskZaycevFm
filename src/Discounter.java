public class Discounter {
    public int[] decryptData(int[] price, int discount, int offset, int readLength){
        if (isIncorrectData(price, discount, offset, readLength))
            throw new IllegalArgumentException("Входные параметры некорректны");

        if (isZeroOrNegativePrice(price))
            throw new IllegalArgumentException("Цены не могут быть отрицательными или нулевыми");

        //непонятно по условию, что делать, если дисконтированная цена станет меньше 1.
        //в данном решении выбрал, что нужно вернуть значение цены 0.

        var result = new int[readLength];

        for (int i = 0; i < readLength; i++){
            result[i] = price[i + offset] * (100 - discount) / 100;
        }
        return result;
    }

    private boolean isIncorrectData(int[] price, int discount, int offset, int readLength){
        boolean isIncorrectData = false;

        if (discount < 1 || discount > 99 ||
                offset < 0 || offset + readLength > price.length ||
                readLength < 1)
            isIncorrectData = true;
        return isIncorrectData;
    }

    private boolean isZeroOrNegativePrice(int[] price){
        boolean isZeroOrNegativePrice = false;

        for (int priceItem : price){
            if (priceItem <= 0)
                isZeroOrNegativePrice = true;
        }
        return isZeroOrNegativePrice;
    }
}
