package com.springcloud.book.ch15_1_pay_server.dao;

import com.springcloud.book.ch15_1_pay_server.model.Account;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2019/9/7
 * @Time: 21:59
 * @email: inwsy@hotmail.com
 * Description:
 */
public interface AccountDao extends CrudRepository<Account, Long> {

    /**
     * 扣减余额
     *
     * @param userId
     * @param price 需要扣减的数目
     * @return 影响记录行数
     */
    @Modifying
    @Query("UPDATE Account SET balance = balance - :price WHERE id = :userId")
    Integer reduceBalance(@Param("userId") Long userId, @Param("price") Integer price);
}
