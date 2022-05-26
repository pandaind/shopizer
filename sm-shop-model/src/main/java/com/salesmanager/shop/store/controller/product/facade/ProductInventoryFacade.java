package com.salesmanager.shop.store.controller.product.facade;

import java.util.List;

import com.salesmanager.core.model.merchant.MerchantStore;
import com.salesmanager.core.model.reference.language.Language;
import com.salesmanager.shop.model.catalog.product.inventory.PersistableInventory;
import com.salesmanager.shop.model.catalog.product.inventory.ReadableInventory;
import com.salesmanager.shop.model.entity.ReadableEntityList;

public interface ProductInventoryFacade {

  ReadableEntityList<ReadableInventory> getInventory(Long productId, MerchantStore store, String child, Language language, int page, int count);
  
  ReadableInventory get(Long inventoryId, MerchantStore store, Language language);
  
  ReadableInventory get(Long productId, Long inventoryId, MerchantStore store, Language language);
  
  ReadableInventory get(Long productId, String child, Language language);
  
  List<ReadableInventory> get(String sku, String merchantStore, MerchantStore store,Language language);
  
  List<ReadableInventory> get(String sku, MerchantStore store,Language language);
  
  ReadableInventory add(Long productId, PersistableInventory inventory, MerchantStore store, Language language);
  
  void update(Long productId, PersistableInventory inventory, MerchantStore store, Language language);
  
  void delete(Long inventoryId, MerchantStore store);
  
  

}
