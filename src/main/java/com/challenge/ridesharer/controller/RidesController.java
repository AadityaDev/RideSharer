package com.challenge.ridesharer.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/rides")
public class RidesController {

	private static final Logger logger = LoggerFactory.getLogger(RidesController.class);

	// @GetMapping
	// public PagedResponse<RideDetail> getPolls(@CurrentUser UserPrincipal
	// currentUser,
	// @RequestParam(value = "page", defaultValue =
	// AppConstants.DEFAULT_PAGE_NUMBER) int page,
	// @RequestParam(value = "size", defaultValue = AppConstants.DEFAULT_PAGE_SIZE)
	// int size) {
	// }

	// @PostMapping
	// @PreAuthorize("hasRole('USER')")
	// public ResponseEntity<?> startRide(@Valid @RequestBody PollRequest
	// pollRequest) {
	//
	// }

	// @PostMapping
	// @PreAuthorize("hasRole('USER')")
	// public ResponseEntity<?> stopRide(@Valid @RequestBody PollRequest
	// pollRequest) {
	//
	// }

	//
	//
	// @GetMapping("/{rideId}")
	// public PollResponse getPollById(@CurrentUser UserPrincipal currentUser,
	// @PathVariable Long pollId) {
	// }

}
