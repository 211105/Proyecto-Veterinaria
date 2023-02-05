package com.example.demo.Services;

import com.example.demo.Entities.Item;
import com.example.demo.Repositories.IItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class ItemServices {

    @Autowired
    private IItemRepository iItemRepository;

    public List<Item> getItem(){
        return iItemRepository.findAll();
    }

    public  Item getIte(int id){
        Item ites = iItemRepository.findById(id);
        return ites;
    }
    public Item add(Item item){
        return iItemRepository.save(item);
    }

    public Item modify(Item item){
        Item modify = iItemRepository.findById(item.getId());
        modify.setName(item.getName());
        modify.setStack(item.getStack());
        modify.setDescription(item.getDescription());
        return iItemRepository.save(modify);
    }
    public void delete(int id){
        Item item1 = iItemRepository.findById(id);
        iItemRepository.delete(item1);
    }
}
