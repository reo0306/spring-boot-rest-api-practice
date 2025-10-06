package com.udemy.spring1hello1.exception;

import java.io.Serial;

public class ItemNotFoundException extends RuntimeException {
   @Serial
   private static final long serialVersionUID = 1L;

   public ItemNotFoundException(Long itemId) {
       super("商品コード" + itemId + "は見つかりません。");
   }
}
