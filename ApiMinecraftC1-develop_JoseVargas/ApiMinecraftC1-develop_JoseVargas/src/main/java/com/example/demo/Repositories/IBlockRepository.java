package com.example.demo.Repositories;

import com.example.demo.Entities.Block;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IBlockRepository extends JpaRepository<Block,Long>{
    @Override
    List<Block> findAll();
    Block Save(Block block);
    Void Delete (Block block);

    Block findById(int id);
}