/*
 * package com.concordia.app.optimisticlock;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.stereotype.Service; import
 * org.springframework.transaction.annotation.Transactional;
 * 
 * import com.concordia.app.dao.ClerkDao; import
 * com.concordia.app.vo.ClerkComponent;
 * 
 * 
 * @Service public class ClerkService {
 * 
 * @Autowired private static ClerkDao clerkdao;
 * 
 * @Transactional public static void save(final ClerkComponent clerk) { int
 * updateCount=clerkdao.update(clerk);
 * 
 * if(updateCount!=1) { throw new
 * IllegalStateException("Data is stale.Please retry"); } } }
 */
