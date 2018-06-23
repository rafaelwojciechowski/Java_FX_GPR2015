insert into europeancorridor(euCorridorNum) select euCorridorNum from masterdata group by euCorridorNum;
insert into roadnumber(roadClassAndNumber) select roadClassAndNumber from masterdata group by roadClassAndNumber;
insert into roadtype(roadType) select roadType from masterdata group by roadType;

insert into segmenttraffic(id, surveyPointNumber, startKilometer, endKilometer, segmentLength, segmentName, sumTraffic, motorbikesTraffic, carsTraffic, deliveryTrucksTraffic, trucksNoTrailersTraffic, trucksWithTrailersTraffic, busesTraffic, tractorsTraffic, voivodeshipNum, another, RoadType_id, RoadNumber_id, EuropeanCorridor_id) 
SELECT 
    m.id,
    m.surveyPointNumber,
    m.startKilometer,
    m.endKilometer,
    m.segmentLength,
    m.segmentName,
    m.sumTraffic,
    m.motorbikesTraffic,
    m.carsTraffic,
    m.deliveryTrucksTraffic,
    m.trucksNoTrailersTraffic,
    m.trucksWithTrailersTraffic,
    m.busesTraffic,
    m.tractorsTraffic,
    m.voivodeshipNum,
    m.another,
    rt.id,
    rn.id,
    ifnull(eu.id, 3)
FROM
    masterdata AS m
        LEFT JOIN
    europeancorridor AS eu ON m.euCorridorNum = eu.euCorridorNum
        LEFT JOIN
    roadnumber AS rn ON m.roadClassAndNumber = rn.roadClassAndNumber
        LEFT JOIN
    roadtype AS rt ON m.roadType = rt.roadType;
