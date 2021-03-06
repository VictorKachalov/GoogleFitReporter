package com.kvs.googlefitreporter.model

import com.google.android.gms.fitness.data.HealthFields

enum class VitalProperty(override val string: String) : Property {
    BLOOD_PRESSURE_SYSTOLIC(HealthFields.FIELD_BLOOD_PRESSURE_SYSTOLIC.name),
    BLOOD_PRESSURE_SYSTOLIC_AVERAGE(HealthFields.FIELD_BLOOD_PRESSURE_SYSTOLIC_AVERAGE.name),
    BLOOD_PRESSURE_SYSTOLIC_MIN(HealthFields.FIELD_BLOOD_PRESSURE_SYSTOLIC_MIN.name),
    BLOOD_PRESSURE_SYSTOLIC_MAX(HealthFields.FIELD_BLOOD_PRESSURE_SYSTOLIC_MAX.name),
    BLOOD_PRESSURE_DIASTOLIC(HealthFields.FIELD_BLOOD_PRESSURE_DIASTOLIC.name),
    BLOOD_PRESSURE_DIASTOLIC_AVERAGE(HealthFields.FIELD_BLOOD_PRESSURE_DIASTOLIC_AVERAGE.name),
    BLOOD_PRESSURE_DIASTOLIC_MIN(HealthFields.FIELD_BLOOD_PRESSURE_DIASTOLIC_MIN.name),
    BLOOD_PRESSURE_DIASTOLIC_MAX(HealthFields.FIELD_BLOOD_PRESSURE_DIASTOLIC_MAX.name),
    BODY_POSITION(HealthFields.FIELD_BODY_POSITION.name),
    BLOOD_PRESSURE_MEASUREMENT_LOCATION(HealthFields.FIELD_BLOOD_PRESSURE_MEASUREMENT_LOCATION.name),
    BLOOD_GLUCOSE_LEVEL(HealthFields.FIELD_BLOOD_GLUCOSE_LEVEL.name),
    TEMPORAL_RELATION_TO_MEAL(HealthFields.FIELD_TEMPORAL_RELATION_TO_MEAL.name),
    TEMPORAL_RELATION_TO_SLEEP(HealthFields.FIELD_TEMPORAL_RELATION_TO_SLEEP.name),
    BLOOD_GLUCOSE_SPECIMEN_SOURCE(HealthFields.FIELD_BLOOD_GLUCOSE_SPECIMEN_SOURCE.name),
    OXYGEN_SATURATION(HealthFields.FIELD_OXYGEN_SATURATION.name),
    OXYGEN_SATURATION_AVERAGE(HealthFields.FIELD_OXYGEN_SATURATION_AVERAGE.name),
    OXYGEN_SATURATION_MIN(HealthFields.FIELD_OXYGEN_SATURATION_MIN.name),
    OXYGEN_SATURATION_MAX(HealthFields.FIELD_OXYGEN_SATURATION_MAX.name),
    SUPPLEMENTAL_OXYGEN_FLOW_RATE(HealthFields.FIELD_SUPPLEMENTAL_OXYGEN_FLOW_RATE.name),
    SUPPLEMENTAL_OXYGEN_FLOW_RATE_AVERAGE(HealthFields.FIELD_SUPPLEMENTAL_OXYGEN_FLOW_RATE_AVERAGE.name),
    SUPPLEMENTAL_OXYGEN_FLOW_RATE_MIN(HealthFields.FIELD_SUPPLEMENTAL_OXYGEN_FLOW_RATE_MIN.name),
    SUPPLEMENTAL_OXYGEN_FLOW_RATE_MAX(HealthFields.FIELD_SUPPLEMENTAL_OXYGEN_FLOW_RATE_MAX.name),
    OXYGEN_THERAPY_ADMINISTRATION_MODE(HealthFields.FIELD_OXYGEN_THERAPY_ADMINISTRATION_MODE.name),
    OXYGEN_SATURATION_SYSTEM(HealthFields.FIELD_OXYGEN_SATURATION_SYSTEM.name),
    OXYGEN_SATURATION_MEASUREMENT_METHOD(HealthFields.FIELD_OXYGEN_SATURATION_MEASUREMENT_METHOD.name),
    BODY_TEMPERATURE(HealthFields.FIELD_BODY_TEMPERATURE.name),
    BODY_TEMPERATURE_MEASUREMENT_LOCATION(HealthFields.FIELD_BODY_TEMPERATURE_MEASUREMENT_LOCATION.name),
    CERVICAL_MUCUS_TEXTURE(HealthFields.FIELD_CERVICAL_MUCUS_TEXTURE.name),
    CERVICAL_MUCUS_AMOUNT(HealthFields.FIELD_CERVICAL_MUCUS_AMOUNT.name),
    CERVICAL_POSITION(HealthFields.FIELD_CERVICAL_POSITION.name),
    CERVICAL_DILATION(HealthFields.FIELD_CERVICAL_DILATION.name),
    CERVICAL_FIRMNESS(HealthFields.FIELD_CERVICAL_FIRMNESS.name),
    MENSTRUAL_FLOW(HealthFields.FIELD_MENSTRUAL_FLOW.name),
    OVULATION_TEST_RESULT(HealthFields.FIELD_OVULATION_TEST_RESULT.name);
}