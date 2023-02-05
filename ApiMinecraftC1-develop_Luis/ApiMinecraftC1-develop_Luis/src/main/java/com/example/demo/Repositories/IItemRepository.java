package com.example.demo.Repositories;

import com.example.demo.Entities.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface IItemRepository extends JpaRepository<Item, Long> {

    List<Item> findAll();

    Item save(Item item);

    Item findById(int id);

    @Override
    void delete(Item item);
}
