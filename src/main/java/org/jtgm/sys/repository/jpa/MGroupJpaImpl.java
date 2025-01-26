package org.jtgm.sys.repository.jpa;

import org.jtgm.sys.repository.entity.healthcheck.MGroupEntity;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class MGroupJpaImpl implements MGroupJpa {
    @Override
    public Optional<MGroupEntity> findByIsActive(Integer isActive) {
        return Optional.empty();
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends MGroupEntity> List<S> saveAllAndFlush(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public void deleteAllInBatch(Iterable<MGroupEntity> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Integer> integers) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public MGroupEntity getOne(Integer integer) {
        return null;
    }

    @Override
    public MGroupEntity getById(Integer integer) {
        return null;
    }

    @Override
    public MGroupEntity getReferenceById(Integer integer) {
        return null;
    }

    @Override
    public <S extends MGroupEntity> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends MGroupEntity> List<S> findAll(Example<S> example) {
        return List.of();
    }

    @Override
    public <S extends MGroupEntity> List<S> findAll(Example<S> example, Sort sort) {
        return List.of();
    }

    @Override
    public <S extends MGroupEntity> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends MGroupEntity> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends MGroupEntity> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends MGroupEntity, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends MGroupEntity> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends MGroupEntity> S save(S entity) {
        return null;
    }

    @Override
    public <S extends MGroupEntity> List<S> saveAll(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public Optional<MGroupEntity> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public List<MGroupEntity> findAll() {
        return List.of();
    }

    @Override
    public List<MGroupEntity> findAllById(Iterable<Integer> integers) {
        return List.of();
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Integer integer) {

    }

    @Override
    public void delete(MGroupEntity entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {

    }

    @Override
    public void deleteAll(Iterable<? extends MGroupEntity> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<MGroupEntity> findAll(Sort sort) {
        return List.of();
    }

    @Override
    public Page<MGroupEntity> findAll(Pageable pageable) {
        return null;
    }
}
