package com.concordia.app.optimisticlock;

public class OptimisticLockException extends RuntimeException { 
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public OptimisticLockException(String description) {
        super(description);
    }
}
