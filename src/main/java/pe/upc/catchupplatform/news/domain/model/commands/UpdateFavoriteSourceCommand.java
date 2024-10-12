package pe.upc.catchupplatform.news.domain.model.commands;

public record UpdateFavoriteSourceCommand(String newsApiKey, String sourceId, String newSourceId) {
    public UpdateFavoriteSourceCommand {
        if (newsApiKey == null || newsApiKey.isEmpty())
            throw new IllegalArgumentException("NewsApiKey cannot be null or empty");
        if (sourceId == null || sourceId.isEmpty())
            throw new IllegalArgumentException("SourceId cannot be null or empty");
        if (newSourceId == null || newSourceId.isEmpty())
            throw new IllegalArgumentException("NewSourceId cannot be null or empty");
    }
}
