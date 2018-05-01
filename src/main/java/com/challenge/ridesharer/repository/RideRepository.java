package com.challenge.ridesharer.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.challenge.ridesharer.model.RideDetail;

@Repository
public interface RideRepository extends JpaRepository<RideDetail, Long> {

	@Query("SELECT v FROM RideDetail v where v.user.id = :userId and v.poll.id in :pollIds")
	List<RideDetail> findByUserIdAndPollIdIn(@Param("userId") Long userId, @Param("pollIds") List<Long> pollIds);

	@Query("SELECT v FROM RideDetail v where v.user.id = :userId and v.poll.id = :pollId")
	RideDetail findByUserIdAndPollId(@Param("userId") Long userId, @Param("pollId") Long pollId);

	@Query("SELECT COUNT(v.id) from RideDetail v where v.user.id = :userId")
	long countByUserId(@Param("userId") Long userId);

	@Query("SELECT v.poll.id FROM RideDetail v WHERE v.user.id = :userId")
	Page<Long> findVotedPollIdsByUserId(@Param("userId") Long userId, Pageable pageable);

}
