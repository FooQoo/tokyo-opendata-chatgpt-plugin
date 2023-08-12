package com.dxjunkyard.opendata.platform.presentation.dto.response;

import com.dxjunkyard.opendata.platform.domain.model.opendata.TokyoDataset;
import lombok.Builder;
import org.springframework.lang.NonNull;

import java.io.Serializable;
import java.util.List;

@Builder
public record OpenDataSearcherResponse(
    @NonNull SearchResultInfoResponse searchResultInfo,
    @NonNull List<TokyoDataset> dataset,
    @NonNull SearchConditionResponse searchCondition,
    @NonNull String showMoreUrl
) implements Serializable {

    @NonNull
    public static OpenDataSearcherResponse empty() {
        return OpenDataSearcherResponse.builder()
            .searchResultInfo(SearchResultInfoResponse.empty())
            .dataset(List.of())
            .searchCondition(SearchConditionResponse.empty())
            .showMoreUrl("")
            .build();
    }
}
