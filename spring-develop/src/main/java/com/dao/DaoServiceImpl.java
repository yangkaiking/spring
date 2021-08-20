package com.dao;

/**
 * DaoServiceImpl
 *
 * @author yangkai
 * @date 2021/8/18 3:08 下午
 */


public class DaoServiceImpl {

	private Dao dao = new DaoImpl();

//	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_UNCOMMITTED, rollbackFor = {Exception.class})
	public void insert(Dao dao) {
		System.out.println("Before DaoServiceImpl insert");
		dao.insert();
		System.out.println("After DaoServiceImpl insert");
	}

	public void delete(Dao dao) {
		System.out.println("Before DaoServiceImpl delete");
		dao.delete();
		System.out.println("After DaoServiceImpl delete");
	}

	public void update(Dao dao) {
		System.out.println("Before DaoServiceImpl update");
		dao.update();
		System.out.println("After DaoServiceImpl update");
	}
}
