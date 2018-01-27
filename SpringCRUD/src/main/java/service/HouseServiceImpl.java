package service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.HousesDAO;

@Service
public class HouseServiceImpl implements HousesService {

	@Autowired
	HousesDAO HousesDAOImpl;
	@Transactional
	public List<String> getHouses() {
		List<String> houses = HousesDAOImpl.getHouses();
		return  houses;
	}

}
