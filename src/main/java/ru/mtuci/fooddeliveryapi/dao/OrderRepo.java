package ru.mtuci.fooddeliveryapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import ru.mtuci.fooddeliveryapi.model.OrderInfo;

@Transactional(readOnly = true)
public interface OrderRepo extends JpaRepository<OrderInfo,Long> {
    @Transactional
    @Modifying
    @Query("DELETE FROM OrderInfo p WHERE p.id=:id")
    int delete(@Param("id") Long id);
}
