package pe.upc.catchupplatform.news.application;

import pe.upc.catchupplatform.news.domain.model.aggregates.FavoriteSource;
import pe.upc.catchupplatform.news.domain.model.queries.GetFavoriteSourceByIdQuery;
import pe.upc.catchupplatform.news.domain.model.queries.GetFavoriteSourceQuery;
import pe.upc.catchupplatform.news.domain.services.FavoriteSourceQueryService;

import java.util.List;
import java.util.Optional;

public class FavoriteSourceQueryServiceImpl implements FavoriteSourceQueryService {
    @Override
    public Optional<FavoriteSource> handle(GetFavoriteSourceByIdQuery query) {
        return Optional.empty();
    }

    @Override
    public Optional<List<FavoriteSource>> handle(GetFavoriteSourceQuery query) {
        return Optional.empty();
    }
}
