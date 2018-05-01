package com.challenge.ridesharer.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.challenge.ridesharer.model.Driver;

@Repository
public interface DriverRepository extends JpaRepository<Driver, Long> {

	@Query("SELECT NEW com.challenge.ridesharer.model.ChoiceVoteCount(v.choice.id, count(v.id)) FROM Driver v WHERE v.ride.id in :pollIds GROUP BY v.choice.id")
	List<Driver> countByPollIdInGroupByChoiceId(@Param("pollIds") List<Long> pollIds);

	@Query("SELECT NEW com.challenge.ridesharer.model.ChoiceVoteCount(v.choice.id, count(v.id)) FROM Driver v WHERE v.ride.id = :pollId GROUP BY v.choice.id")
	List<Driver> countByPollIdGroupByChoiceId(@Param("pollId") Long pollId);

	@Query("SELECT v FROM Driver v where v.user.id = :userId and v.ride.id in :pollIds")
	List<Driver> findByUserIdAndPollIdIn(@Param("userId") Long userId, @Param("pollIds") List<Long> pollIds);

	@Query("SELECT v FROM Driver v where v.user.id = :userId and v.ride.id = :pollId")
	Driver findByUserIdAndPollId(@Param("userId") Long userId, @Param("pollId") Long pollId);

	@Query("SELECT COUNT(v.id) from Driver v where v.user.id = :userId")
	long countByUserId(@Param("userId") Long userId);

	@Query("SELECT v.ride.id FROM Driver v WHERE v.user.id = :userId")
	Page<Long> findVotedPollIdsByUserId(@Param("userId") Long userId, Pageable pageable);
}
