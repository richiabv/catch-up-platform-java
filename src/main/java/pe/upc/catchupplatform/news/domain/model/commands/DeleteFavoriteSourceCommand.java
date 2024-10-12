package pe.upc.catchupplatform.news.domain.model.commands;

public record DeleteFavoriteSourceCommand(String newsApiKey, String sourceId) {
    public DeleteFavoriteSourceCommand {
        if (newsApiKey == null || newsApiKey.isEmpty())
            throw new IllegalArgumentException("NewsApiKey cannot be null or empty");
        if (sourceId == null || sourceId.isEmpty())
            throw new IllegalArgumentException("SourceId cannot be null or empty");
    }
}
