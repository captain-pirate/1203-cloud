package model;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author AI
 * @title: BookInfo
 * @projectName 1128kaoshi
 * @description: TODO
 * @date 2019/11/2115:17
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class BookInfo implements Serializable {
    private Long bookId;
    private String bookName;
    private Long bookStore;
    private BigDecimal bookPrice;
}
