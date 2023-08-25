package com.example.demo.repo;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.example.demo.model.IplModel;
import jakarta.transaction.Transactional;

public interface IplRepo extends JpaRepository<IplModel, Integer> {
	@Query(value="select * from IplModel", nativeQuery = true)
	public List<IplModel> getAllRows();
	@Query(value="select * from IplModel where address=:addr and playername=:name",nativeQuery = true )
	public List<IplModel> getSpecRows(@Param("addr") String addr,@Param("name") String name);
	
	//delete the query
	@Modifying
	@Transactional
	@Query(value = "delete from IplModel where player_id:?1",nativeQuery = true )
	public int deletedId(@Param("id") int id);
	
	//update  the query
	@Modifying
	@Transactional
	@Query(value = "update iplm from IplModel where player_id:?1",nativeQuery = true )
	public Integer updateByid(@Param("addr") String sddr,@Param("id") int id);
	
}
