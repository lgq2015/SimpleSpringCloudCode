package com.springcloud.book.ch14_1_pay_server.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2019/9/7
 * @Time: 21:59
 * @email: inwsy@hotmail.com
 * Description:
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "balance")
    private Integer balance;
}
