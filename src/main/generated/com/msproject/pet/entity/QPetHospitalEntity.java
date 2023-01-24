package com.msproject.pet.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QPetHospitalEntity is a Querydsl query type for PetHospitalEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPetHospitalEntity extends EntityPathBase<PetHospitalEntity> {

    private static final long serialVersionUID = -1717525336L;

    public static final QPetHospitalEntity petHospitalEntity = new QPetHospitalEntity("petHospitalEntity");

    public final StringPath hospitalAddr = createString("hospitalAddr");

    public final NumberPath<Long> hospitalId = createNumber("hospitalId", Long.class);

    public final StringPath hospitalName = createString("hospitalName");

    public final StringPath hospitalNum = createString("hospitalNum");

    public final StringPath hospitalStreetAddr = createString("hospitalStreetAddr");

    public final StringPath hospitalStreetZip = createString("hospitalStreetZip");

    public final StringPath hospitalZip = createString("hospitalZip");

    public final NumberPath<java.math.BigDecimal> latitude = createNumber("latitude", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> longitude = createNumber("longitude", java.math.BigDecimal.class);

    public final StringPath operationYn = createString("operationYn");

    public final StringPath sigunName = createString("sigunName");

    public QPetHospitalEntity(String variable) {
        super(PetHospitalEntity.class, forVariable(variable));
    }

    public QPetHospitalEntity(Path<? extends PetHospitalEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPetHospitalEntity(PathMetadata metadata) {
        super(PetHospitalEntity.class, metadata);
    }

}

