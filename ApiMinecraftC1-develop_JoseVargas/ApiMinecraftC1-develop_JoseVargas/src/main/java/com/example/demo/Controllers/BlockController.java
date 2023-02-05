package com.example.demo.Controllers;
import com.example.demo.Entities.Block;
import com.example.demo.Services.BlockServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Id;
import java.util.List;

@RestController
@RequestMapping("Block")
public class BlockController {
    @Autowired
    private BlockServices blockServices;
    @GetMapping("list")
    public List<Block> blockList(){
         return blockServices.getBlock();
    }
    @GetMapping("/Block")
    public Block getBlock(int id){
        return blockServices.getBlock(id);
    }
    @PostMapping("/addBlock")
    public Block add(@RequestBody @Validated Block block){
        System.out.println("Entre");
        return blockServices.add(block);
    }
    @PutMapping("/modifi")
    public Block modify(@RequestBody @Validated Block item){
        return  blockServices.modify(item);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") int id){
        blockServices.delete(id);
    }
    }
