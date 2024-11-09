package com.eventostec.api.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eventostec.domain.address.Address;

public interface AddressRepository extends JpaRepository <Address, UUID> {

}
