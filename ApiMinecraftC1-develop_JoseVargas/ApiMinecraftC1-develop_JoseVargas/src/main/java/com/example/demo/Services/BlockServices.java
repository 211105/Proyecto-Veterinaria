package com.example.demo.Services;
import com.example.demo.Entities.Block;
import com.example.demo.Repositories.IBlockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlockServices {
    @Autowired
    private IBlockRepository iBlockRepository;
    public List <Block> getBlock(){
        return iBlockRepository.findAll();
    }
    public Block add(Block block){
        return iBlockRepository.save(block);
    }
    public  Block modify(Block block){
        Block modify = iBlockRepository.findById(block.getId());
        modify.setName(block.getName());
        modify.setGravity(block.getGravity());
        modify.setWorld(block.getWorld());
        return iBlockRepository.save(modify);
    }
    public void delete(int id){
        Block block1 = iBlockRepository.findById(id);
        iBlockRepository.delete(block1);
    }
}
